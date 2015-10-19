module Asposediagramjava
  module CreateUserDefinedCell
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        pages = diagram.getPages()
        
        i = 0
        while i < pages.getCount()
            page = pages.get(i)
            shapes = page.getShapes()
            j = 0
            while j < shapes.getCount()
                shape = shapes.get(j)
                if shape.getNameU() == "Process"
                    # Initialize user object
                    user = Rjb::import('com.aspose.diagram.User').new
                    user.setName("UserDefineCell")
                    user.getValue().setVal("800")

                    # Add user-defined cell
                    shape.getUsers().add(user)
                end
                j +=1
            end
            i +=1
        end

        # Save diagram
        diagram.save(data_dir + "UserDefinedCells.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Created User-defined Cell in the ShapeSheet."
    end
  end
end
