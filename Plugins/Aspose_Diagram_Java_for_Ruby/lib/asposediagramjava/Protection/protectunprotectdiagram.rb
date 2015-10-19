module Asposediagramjava
  module ProtectUnprotectDiagram
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        diagram.getDocumentSettings().setProtectBkgnds(1)
        diagram.getDocumentSettings().setProtectMasters(1)
        diagram.getDocumentSettings().setProtectShapes(1)
        diagram.getDocumentSettings().setProtectStyles(1)

        # Save diagram
        diagram.save(data_dir + "ProtectUnprotectDiagram.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Applied protection on diagram successfully!"
    end
  end
end
