module Asposediagramjava
  module AddDynamicGridsAndConnectionPoints
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # get window object by index
        window = diagram.getWindows().get(0)
        
        # check dynamic grid option
        window.setDynamicGridEnabled(1)
        
        # check connection points option
        window.setShowConnectionPoints(1)

        # Save as VDX
        diagram.save(data_dir + "AddDynamicGridsAndConnectionPoints.vsx", Rjb::import('com.aspose.diagram.SaveFileFormat').VSX)

        puts "Added Support of Dynamic Grids and Connection Points in the Visio Drawings."
    end
  end
end
