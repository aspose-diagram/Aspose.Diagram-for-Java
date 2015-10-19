module Asposediagramjava
  module GetConnectorsInfo
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        connectors = diagram.getPages().getPage(0).getConnects()
        
        i = 0
        while i < connectors.getCount()
            connector = connectors.get(i)
            # Display information about the Connectors
            puts "From Shape ID : " + connector.getFromSheet().to_s
            puts "To Shape ID : " + connector.getToSheet().to_s

            i +=1
        end
    end
  end
end
