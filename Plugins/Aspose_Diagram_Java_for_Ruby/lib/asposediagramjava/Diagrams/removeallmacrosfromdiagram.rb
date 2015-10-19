module Asposediagramjava
  module RemoveAllMacrosFromDiagram
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # remove all macros
        diagram.setVbProjectData(nil)

        # Save as VDX
        diagram.save(data_dir + "RemoveAllMacros.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Removed all macros from diagram successfully!"
    end
  end
end
