; Copyright (c) 2013-2014 Tim Molderez.
;
; All rights reserved. This program and the accompanying materials
; are made available under the terms of the 3-Clause BSD License
; which accompanies this distribution, and is available at
; http://www.opensource.org/licenses/BSD-3-Clause

(ns inspector-jay.core
  "Inspector Jay is a simple GUI application that lets you inspect Java objects and Clojure data structures."
  {:author "Tim Molderez"}
  (:gen-class
    :name inspectorjay.InspectorJay
    :prefix java-
    :methods [#^{:static true} [inspect [Object] Object]])
  (:use [inspector-jay.gui])
  (:import [inspector_jay Test]))

(defn 
  inspect ^Object	[^Object object]
 "Displays an object inspector window for a given object.
  The return value of inspect is the object itself, so you can plug in this function anywhere you like."
  (main-gui object)
 object)

(defn
  java-inspect [object]
  "Java wrapper for the inspect function.
   When using Java, you can call this function as follows:
   inspectorjay.InspectorJay.inspect(anObject);"
  (inspect object))

(inspect (new Test))