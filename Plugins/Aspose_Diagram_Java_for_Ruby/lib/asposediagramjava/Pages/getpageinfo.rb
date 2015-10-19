module Asposediagramjava
  module GetPageInfo
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        #page = diagram.getPages().getPage(page_id)
        page = diagram.getPages().getPage(0)
        
        puts "Page ID : " + page.getName().to_s
    end
  end
end
