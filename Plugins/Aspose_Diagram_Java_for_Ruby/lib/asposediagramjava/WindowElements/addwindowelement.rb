module Asposediagramjava
  module AddWindowElement
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # initialize window object
        window = Rjb::import('com.aspose.diagram.Window').new
        
        # set window state
        window.setWindowState(Rjb::import('com.aspose.diagram.WindowStateValue').MAXIMIZED)
        
        # set window height
        window.setWindowHeight(500)
        
        # set window width
        window.setWindowWidth(500)
        
        # set window type
        window.setWindowType(Rjb::import('com.aspose.diagram.WindowTypeValue').STENCIL)
        
        # add window object
        diagram.getWindows().add(window)

        # save in any supported format
        diagram.save(data_dir + "AddWindowElement.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Added window element to the visio instance."
    end
  end
end
