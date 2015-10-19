module Asposediagramjava
  module SelectRerouteOption
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Access a particular page
        page = diagram.getPages().getPage("Flow 1")

        # get a particular connector shape
        shape = page.getShapes().getShape(1)
        
        # set reroute option
        shape.getLayout().getConFixedCode().setValue(Rjb::import('com.aspose.diagram.ConFixedCodeValue').NEVER_REROUTE)

        # Save diagram
        diagram.save(data_dir + "SelectRerouteOption.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Seleted reroute option of the connector shape."
    end
  end
end
