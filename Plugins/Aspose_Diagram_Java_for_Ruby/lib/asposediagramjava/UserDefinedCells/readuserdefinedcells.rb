module Asposediagramjava
  module ReadUserDefinedCells
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "UserDefinedCells.vdx")

        shapes = diagram.getPages().getPage("Flow 1").getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "Process"
                users = shape.getUsers()
                j = 0
                while j < users.getCount()
                    user = users.get(j)
                    puts user.getName() + ": " + user.getValue().getVal()
                    j +=1
                end
                break
            end
            i +=1
        end
    end
  end
end
