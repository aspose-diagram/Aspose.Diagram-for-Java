module Asposediagramjava
  module ExtractImages
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage("Flow 1").getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            # Filter shapes by type Foreign
            if shape.getType() == Rjb::import('com.aspose.diagram.TypeValue').FOREIGN
                # create an image file
                fos = Rjb::import('java.io.FileOutputStream').new(data_dir + "Image#{i}.bmp")
                fos.write(shape.getForeignData().getValue())
                fos.close()
            end

            i +=1
        end

        puts "Extracted images successfully!"
    end
  end
end
