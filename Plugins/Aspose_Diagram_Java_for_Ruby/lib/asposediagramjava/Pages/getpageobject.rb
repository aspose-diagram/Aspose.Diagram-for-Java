module Asposediagramjava
  module GetPageObject
    def initialize()
        # Getting a Page Object by ID
        get_page_object_by_id()

        # Getting a Page Object by Name
        get_page_object_by_name()        
    end

    def get_page_object_by_id() 
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        page_id = 0
        # Get page object by id
        page = diagram.getPages().getPage(page_id)

        puts "Page : " + page.to_string
    end

    def get_page_object_by_name() 
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Set page name
        page_name = "Flow 1"
        # Get page object by name
        page = diagram.getPages().getPage(page_name)

        puts "Page : " + page.to_string
    end
  end
end
