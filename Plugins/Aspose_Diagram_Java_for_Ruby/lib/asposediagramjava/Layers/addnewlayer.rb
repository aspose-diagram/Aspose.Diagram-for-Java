module Asposediagramjava
  module AddNewLayer
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Basic_Shapes.vsd")

        # get Visio page
        page = diagram.getPages().getPage(0)

        # initialize a new Layer class object
        layer = Rjb::import('com.aspose.diagram.Layer').new
        
        # set Layer name
        layer.getName().setValue("Layer2")
        
        # set Layer Visibility
        layer.getVisible().setValue(2)

        # add Layer to the particular page sheet
        page.getPageSheet().getLayers().add(layer)

        # add a new shape
        shape_id = page.addShape(3.0, 3.0, 0.36, 0.36, "Circle")
        
        # get the Shape object
        shape = page.getShapes().getShape(shape_id)
        
        # assign this new Layer
        shape.getLayerMem().getLayerMember().setValue(layer.getIX().to_s)

        # Save diagram
        diagram.save(data_dir + "AddNewLayer.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Added a new Layer in the Visio Diagram."
    end
  end
end
