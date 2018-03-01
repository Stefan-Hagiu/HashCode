SRCDIR = src
SOURCES = $(wildcard $(SRCDIR)/*.java)

.PHONY: all
all: submit.zip

submit.zip: $(SOURCES)
	zip -r $@ $(SRCDIR)

.PHONY: test a b c d e

test: a b c d e

a:
	cd src/ && java Main ../a_example

b:
	cd src/ && java Main ../b_should_be_easy

c:
	cd src/ && java Main ../c_no_hurry

d:
	cd src/ && java Main ../d_metropolis

e:
	cd src/ && java Main ../e_high_bonus

