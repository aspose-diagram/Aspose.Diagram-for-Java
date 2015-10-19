module Asposediagramjava
  module SetShapeFillData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "rectangle" && shape.getID() == 1
                shape.getFill().getFillBkgnd().setValue(diagram.getPages().getPage(0).getShapes().getShape(0).getFill().getFillBkgnd().getValue())
                shape.getFill().getFillForegnd().setValue("#ebf8df")
            end
            i +=1
        end
        
        # Save diagram
        diagram.save(data_dir + "SetShapeFillData.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Set visio shape's fill data."
    end
  end
end
