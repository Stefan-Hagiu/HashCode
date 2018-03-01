SRCDIR = src
SOURCES = $(wildcard $(SRCDIR)/*.java)

.PHONY: all
all: submit.zip

submit.zip: $(SOURCES)
	zip -r $@ $(SRCDIR)
