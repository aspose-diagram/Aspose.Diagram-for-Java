module Asposediagramjava
  module ReplacePictureShape
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # convert image into bytes array       
        fi = Rjb::import('java.io.File').new(data_dir + "star.png")
        file_content = Rjb::import('java.nio.file.Files').readAllBytes(fi.toPath())

        shapes = diagram.getPages().getPage("Flow 1").getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            # Filter shapes by type Foreign
            if shape.getType() == Rjb::import('com.aspose.diagram.TypeValue').FOREIGN
                # replace picture shape
                shape.getForeignData().setValue(file_content)
            end

            i +=1
        end

        # Save diagram
        diagram.save(data_dir + "ReplacePictureShape.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Replaced picture shape successfully!"
    end
  end
end
