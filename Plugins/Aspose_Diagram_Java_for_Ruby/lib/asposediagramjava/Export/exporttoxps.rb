module Asposediagramjava
  module ExportToXps
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Save as XPS
        diagram.save(data_dir + "Diagram.xps", Rjb::import('com.aspose.diagram.SaveFileFormat').XPS)

        puts "Exported visio diagram to XPS."
    end
  end
end
