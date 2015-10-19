module Asposediagramjava
  module ShowHideProperties
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # get window object by index
        window = diagram.getWindows().get(0)
        
        # set visibility of grid
        window.setShowGrid(1)
        
        # set visibility of guides
        window.setShowGuides(1)
        
        # set visibility of rulers
        window.setShowRulers(1)
        
        # set visibility of page breaks
        window.setShowPageBreaks(1)

        # save in any supported format
        diagram.save(data_dir + "ShowHideProperties.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Show and Hide Grids, Rulers, Guides and Page Breaks of the Visio Diagram."
    end
  end
end
