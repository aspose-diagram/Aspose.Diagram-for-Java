module Asposediagramjava
  module CreateDiagram
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new

        # Save as VDX
        diagram.save(data_dir + "CreateDiagram.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Created visio diagram successfully!"
    end
  end
end
