module Asposediagramjava
  module GetShapeIcon
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Basic_Shapes.vsd")

        # get master
        master = diagram.getMasters().getMasterByName("Circle")
        
        # get byte array
        bytes = master.getIcon()
        
        # create an image file
        fos = Rjb::import('java.io.FileOutputStream').new(data_dir + "MyImage.png")
        
        # write byte array of the image
        fos.write(bytes)
        
        # close array
        fos.close()

        puts "Get shape icon, please check the output file."
    end
  end
end
