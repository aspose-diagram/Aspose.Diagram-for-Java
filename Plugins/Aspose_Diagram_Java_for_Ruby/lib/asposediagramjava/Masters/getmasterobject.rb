module Asposediagramjava
  module GetMasterObject
    def initialize()
        # Getting a Master Object by ID
        get_master_object_by_id()

        # Getting a Master Object by Name
        get_master_object_by_name()        
    end

    def get_master_object_by_id() 
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        master_id = 2
        # Get master object by id
        master = diagram.getMasters().getMaster(master_id)

        puts "Master ID : " + master.getID().to_s
        puts "Master Name : " + master.getName().to_s
    end

    def get_master_object_by_name() 
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Set master name
        master_name = "Background tranquil .2"
        # Get master object by name
        master = diagram.getMasters().getMasterByName(master_name)

        puts "Master ID : " + master.getID().to_s
        puts "Master Name : " + master.getName().to_s
    end
  end
end
