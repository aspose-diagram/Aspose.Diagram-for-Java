module Asposediagramjava
  module ExportToXaml
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Save as XAML
        diagram.save(data_dir + "Diagram.xaml", Rjb::import('com.aspose.diagram.SaveFileFormat').XAML)

        puts "Exported visio diagram to XAML."
    end
  end
end
