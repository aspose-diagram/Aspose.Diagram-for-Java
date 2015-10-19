module Asposediagramjava
  module GetWindowElements
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        windows = diagram.getWindows()

        i = 0
        while i < windows.getCount()
            window = windows.get(i)
            puts "ID: " + window.getID().to_s
            puts "Type: " + window.getWindowType().to_s
            puts "Window height: " + window.getWindowHeight().to_s
            puts "Window width: " + window.getWindowWidth().to_s
            puts "Window state: " + window.getWindowState().to_s

            i +=1
        end
    end
  end
end
