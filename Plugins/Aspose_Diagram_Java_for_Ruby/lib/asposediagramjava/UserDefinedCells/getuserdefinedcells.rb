module Asposediagramjava
  module GetUserDefinedCells
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "UserDefinedCells.vdx")

        pages = diagram.getPages()
        
        count = 0
        while count < pages.getCount()
            page = pages.get(count)
            shapes = page.getShapes()
            i = 0
            while i < shapes.getCount()
                shape = shapes.get(i)
                if shape.getNameU() == "Process"
                    users = shape.getUsers()
                    j = 0
                    while j < users.getCount()
                        user = users.get(j)
                                    puts "Name: " + user.getNameU() + " Value: " + user.getValue().getVal() + " Prompt: " + user.getPrompt().getValue()
                        j +=1
                    end
                    break
                end
                i +=1
            end
            count +=1
        end
    end
  end
end
