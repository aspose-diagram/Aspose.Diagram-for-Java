module Asposediagramjava
  module ReadShapeData
    def initialize()
        # Read All Shape Properties
        read_all_shape_properties()

        # Read a Shape Property by Name
        read_shape_property_by_name()
    end

    def read_all_shape_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getName() == "Process"
                j = 0
                while j < shape.getProps().getCount()
                    property = shape.getProps().get(j)
                    puts property.getLabel().getValue() + ": " + property.getValue().getVal()
                    j +=1
                end
                break
            end

            i +=1
        end
    end

    def read_shape_property_by_name()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getName() == "Process"
                property = shape.getProps().getProp("Cost")
                puts property.getLabel().getValue() + ": " + property.getValue().getVal()
            end
            i +=1
        end
    end
  end
end
