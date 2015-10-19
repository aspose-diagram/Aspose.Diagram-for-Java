module Asposediagramjava
  module GetMasterInfo
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Call the diagram constructor to load diagram from a VSD file
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        masters = diagram.getMasters()

        i = 0
        while i < masters.getCount()
            master = masters.get(i)
            puts "Master ID : " + master.getID().to_s
            puts "Master Name : " + master.getName().to_s

            i +=1
        end        
    end
  end
end
