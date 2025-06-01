//> using scala 3.7.0
//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"

// build slides with `scala run .`

import taggy.*

@main def build = slides.toPdf()

def slides = document("Improving AI-supported requirements engineering effectiveness by annotating natural language requirements with essential requirements engineering keywords", author = "Björn Regnell"):
  frame("Questions"):
    p("**Effective AI4RE**: ")
    itemize:
      p("How to use artificial intelligence to support requirements engineering in an effective and efficient way?")
      itemize:
        p("What is a good context for AI-supported RE?")
        p("Can tagged natural language (NL) improve AI4RE?")
        p("How to study the effectiveness of AI4RE?")
      p("Using reqT to tag natural language requirements")
    p("\\vfill These slides here: https://github.com/bjornregnell/AI4RE-with-reqT")


  frame("What is a good context?"):
    image("../img/ai4re.jpg", width = 0.75)
    itemize:
      p("Specific domain knowledge")
      p("General RE knowledge")
      itemize:
        p("reqT entities, attributes, relations")

  frame("What is reqT?"):
    itemize:
      p("reqT is an open source language and tool for annotating natural language requirements with essential RE keywords")
      p("Common keywords for RE entities, attributes, relations") 
      p("A subset of Markdown syntax: nested bullet lists")
      itemize:
        p("https://reqt.github.io")
    code("""
      * Feature: helloWorld has 
        * Spec: Print a nice greeting.
        * Why: First step to get started.
      """)

  frame("reqT concepts"):
    def small = s"{}\\fontsize{9}{11}\\selectfont{} "

    itemize: 
      p("**Entities** that have identity (a meaningful, unique name)")

      itemize:
        p(s"$small Actor, App, Barrier, Breakpoint, Class, Component, Configuration, Data, Design, Domain, Epic, Event, Feature, Field, Function, Goal, Idea, Image, Interface, Issue, Item, Label, Member, Module, Product, Prototype, Quality, Relationship, Release, Req, Resource, Risk, Scenario, Screen, Section, Service, Stakeholder, State, Story, System, Target, Task, Term, Test, UseCase, User, Variant, VariationPoint, WorkPackage")

      p("**Attributes** that represent values (strings or integers)")
      itemize:
        p(s"$small Benefit, Capacity, Comment, Constraints, Cost, Damage, Deprecated, Example, Expectation, Failure, Frequency, Gist, Input, Location, Max, Min, Order, Output, Prio, Probability, Profit, Spec, Text, Title, Value, Why")

      p("**Relations** that connect entities with entities and attributes")

      itemize:
        p(s" $small binds, deprecates, excludes, has, helps, hurts, impacts, implements, interactsWith, is, precedes, relatesTo, requires, verifies")


  frame("reqT metamodel"):
    image("../img/metamodel.pdf", width = 0.6)

  frame("reqT metamodel"):
    image("../img/metamodel-all.pdf", width = 0.95)

  frame("Questions to discuss"):
    enumerate:
      p("What reqT concepts do you think would be benefical to include as general context for AI-supported RE?")
      p("How would you design a study to evaluate the effectiveness and efficiency of AI-supported RE with reqT?")
    
    p("~\\pause{}")
    image("../img/design-science.png", width = 0.62)
