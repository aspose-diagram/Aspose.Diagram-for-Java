module Asposediagramjava
  module RotateShape
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Add a shape and set the angle
        diagram.getPages().getPage(0).getShapes().getShape(1).setAngle(190)

        # Save diagram
        diagram.save(data_dir + "RotateShape.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Rotated shape."
    end
  end
end
