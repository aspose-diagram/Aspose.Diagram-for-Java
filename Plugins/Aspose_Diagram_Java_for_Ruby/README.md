# Aspose_Diagram_Java_for_Ruby
Aspose.Diagram Java for Ruby is a Ruby gem that demonstrates / provides the Aspose.Diagram for Java API usage examples in Ruby by using Rjb - Ruby Java Bridge.

## Installation

Execute following command.

    $ gem install asposediagramjava

To download Aspose.Diagram for Java API to be used with these examples through RJB, Please navigate to:

http://www.aspose.com/downloads/diagram/java

Note: Create jars folder at root of the gem folder and copy downloaded Aspose.Diagram for java component into it.

For most complete documentation of the project, check Aspose.OCR Java for Ruby confluence wiki link:

https://docs.aspose.com/display/diagramjava/Aspose.Diagram+Java+For+Ruby

## Usage

You can export visio diagram to pdf document using following example code.

```ruby
require File.dirname(File.dirname(File.dirname(__FILE__))) + '/lib/asposediagramjava'
include Asposediagramjava
include Asposediagramjava::ExportToPdf
initialize_aspose_Diagram
```
Lets understand the above code
* The first line makes sure that the Aspose.Diagram is loaded and available 
* Include the files that are required to access the Aspose.Diagram
* Initialize the libraries. The aspose JAVA classes are loaded from the path provided in the aspose.yml file

## Download Latest Versions?

* [Latest Releases on Codeplex](https://asposediagramjavaruby.codeplex.com/)

## Clone Plugin SourceCodes?

This project is also hosted and maintained at CodePlex. To clone navigate to:

* [Aspose.Diagram Java for Ruby on CodePlex - click here](https://asposediagramjavaruby.codeplex.com/SourceControl/latest#README.md)
