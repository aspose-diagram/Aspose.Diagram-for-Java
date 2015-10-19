module Asposediagramjava
  module AddSolutionXmlElement
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # initialize SolutionXML object
        solution_xml = Rjb::import('com.aspose.diagram.SolutionXML').new
        
        # set name
        solution_xml.setName("Solution XML")
        
        # set xml value
        solution_xml.setXmlValue("XML Value")
        
        # add SolutionXML element
        diagram.getSolutionXMLs().add(solution_xml)

        # save Visio diagram
        diagram.save(data_dir + "SolutionXmlElement.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Added SolutionXML Element to the Visio Drawing."
    end
  end
end
