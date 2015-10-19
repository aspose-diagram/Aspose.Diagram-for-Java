module Asposediagramjava
  module SetMilestoneShapeProperties
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shape_id = 1
        
        # Get timeline shape
        milestone = diagram.getPages().getPage("Flow 1").getShapes().getShape(shape_id)

        # Initialize MilestoneHelper object
        milestone_helper = Rjb::import('com.aspose.diagram.MilestoneHelper').new(milestone)
        
        # Set date format
        milestone_helper.setDateFormat(21)
        
        # Set auto update flag
        milestone_helper.setAutoUpdate(true)
        
        # Set milestone type
        milestone_helper.setType(6)

        # Save diagram
        diagram.save(data_dir + "SetMilestoneShapeProperties.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Set milestone shape properties."
    end
  end
end
