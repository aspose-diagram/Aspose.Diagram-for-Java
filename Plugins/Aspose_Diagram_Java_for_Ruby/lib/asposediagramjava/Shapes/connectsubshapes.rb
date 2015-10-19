module Asposediagramjava
  module ConnectSubShapes
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Access a particular page
        page = diagram.getPages().getPage("Flow 1")

        # Set sub shape ids
        shape_from_id = 1
        shape_to_id = 9

        # Initialize connector shape
        shape = Rjb::import('com.aspose.diagram.Shape').new
        shape.getLine().getEndArrow().setValue(5)
        shape.getLine().getLineWeight().setValue(0.01388)

        # Add shape
        connecter_id = diagram.addShape(shape, "Dynamic connector", page.getID())
        
        # Connect sub-shapes
        connection_point_place = Rjb::import('com.aspose.diagram.ConnectionPointPlace')
        page.connectShapesViaConnector(shape_from_id, connection_point_place.RIGHT, shape_to_id, connection_point_place.LEFT, connecter_id)

        # Save diagram
        diagram.save(data_dir + "ConnectSubShapes.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Connected sub-shapes of a group."
    end
  end
end
