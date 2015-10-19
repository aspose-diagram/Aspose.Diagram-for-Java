module Asposediagramjava
  module GetAllLayers
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # get Visio page
        page = diagram.getPages().getPage(0)

        layers = page.getPageSheet().getLayers()
        
        i = 0
        while i < layers.getCount()
            layer = layers.get(i)
            puts "Name: " + layer.getName().getValue().to_s
            puts "Visibility: " + layer.getVisible().getValue().to_s
            puts "Status: " + layer.getStatus().getValue().to_s
            
            i +=1
        end
    end
  end
end
