module Asposediagramjava
  module ExportToImage
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Save as PNG
        diagram.save(data_dir + "Diagram.png", Rjb::import('com.aspose.diagram.SaveFileFormat').PNG)

        puts "Exported visio diagram to PNG."
    end
  end
end
