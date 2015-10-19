module Asposediagramjava
  module GetShapeInfo
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            # Display information about the shapes
            puts "Shape ID : " + shape.getID().to_s
            puts "Name : " + shape.getName().to_s
            puts "Master Shape : " + shape.getMaster().getName().to_s

            i +=1
        end
    end
  end
end
