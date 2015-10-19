module Asposediagramjava
  module AddCommentToDiagram
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Add comment
        diagram.getPages().getPage(0).addComment(7.205905511811023, 3.880708661417323, "test@")

        # Save as VDX
        diagram.save(data_dir + "AddComment.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Added comment successfully!"
    end
  end
end
