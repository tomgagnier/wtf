# Make or update SVG diagrams from UML sources.

uml_sources = $(wildcard *.uml)
svg_diagrams = $(patsubst %.uml,%.svg,${uml_sources})

build: ${svg_diagrams}

clean:
	rm -f *.svg

%.svg: %.uml
	plantuml -tsvg $<

