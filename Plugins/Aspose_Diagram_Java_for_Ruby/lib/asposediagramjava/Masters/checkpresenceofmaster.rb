module Asposediagramjava
  module CheckPresenceOfMaster
    def initialize()
        # Checking a Master Presence by ID
        check_presence_master_by_id()

        # Checking a Master Presence by Name
        check_presence_master_by_name()        
    end

    def check_presence_master_by_id() 
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        master_id = 2
        # check master by id
        is_present = diagram.getMasters().isExist(master_id)

        puts "Master Presence : " + is_present.to_s
    end

    def check_presence_master_by_name() 
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Set master name
        master_name = "Background tranquil .2"
        # check master object by name
        is_present = diagram.getMasters().isExist(master_name)

        puts "Master Presence : " + is_present.to_s
    end
  end
end
