module Asposediagramjava
  module GetDiagramFontInfo
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        fonts = diagram.getFonts()

        i = 0
        while i < fonts.getCount()
            font = fonts.get(i)
            # Display information about the fonts
            puts font.getName()

            i +=1
        end
    end
  end
end
