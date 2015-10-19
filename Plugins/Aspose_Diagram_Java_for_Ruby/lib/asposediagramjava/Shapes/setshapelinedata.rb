module Asposediagramjava
  module SetShapeLineData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "rectangle" && shape.getID() == 1
                shape.getLine().getLineColor().setValue(diagram.getPages().getPage(0).getShapes().getShape(1).getFill().getFillForegnd().getValue())
                shape.getLine().getLineWeight().setValue(0.07041666666666667)
                shape.getLine().getRounding().setValue(0.1)
            end
            i +=1
        end
        
        # Save diagram
        diagram.save(data_dir + "SetShapeLineData.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Set visio shape's line data."
    end
  end
end
