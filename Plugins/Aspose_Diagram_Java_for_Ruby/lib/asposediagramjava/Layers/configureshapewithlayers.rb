module Asposediagramjava
  module ConfigureShapeWithLayers
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage("Flow 1").getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            #puts shape.getName().to_s
            if shape.getName() == "Process"
                # Add shape1 in first two layers. Here "0;1" are indexes of the layers
                layer = shape.getLayerMem()
                layer.getLayerMember().setValue("0;1")
            elsif shape.getName() == "Preparation"
                # Remove shape2 from all the layers
                layer = shape.getLayerMem()
                layer.getLayerMember().setValue("")
            end

            i +=1
        end

        # Save diagram
        diagram.save(data_dir + "Layers.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Configured Shape Objects with Layers in Visio."
    end
  end
end
