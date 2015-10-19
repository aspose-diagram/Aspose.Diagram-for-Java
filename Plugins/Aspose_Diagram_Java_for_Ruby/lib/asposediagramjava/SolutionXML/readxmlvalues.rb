module Asposediagramjava
  module ReadXmlValues
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "SolutionXmlElement.vdx")

        solution_xmls = diagram.getSolutionXMLs()

        i = 0
        while i < solution_xmls.getCount()
            solution_xml = solution_xmls.get(i)
            # get name property
            puts "Name: " + solution_xml.getName().to_s
            # get xml value
            puts "Value:" + solution_xml.getXmlValue().to_s

            i +=1
        end
    end
  end
end
