module Asposediagramjava
  module GetShapeHyperlinkData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Hyperlinks.vdx")

        # Get a particular shape
        shape = diagram.getPages().getPage("Flow 1").getShapes().getShape(1)

        hyperlinks = shape.getHyperlinks()

        i = 0
        while i < hyperlinks.getCount()
            hyperlink = hyperlinks.get(i)
            puts "Address: " + hyperlink.getAddress().getValue().to_s
            puts "Sub Address: " + hyperlink.getSubAddress().getValue().to_s
            puts "Description: " + hyperlink.getDescription().getValue().to_s

            i +=1
        end
    end
  end
end
