(ns idbrain.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/idbrain/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"
                          :counter 12}))


(defn hello-world []
  [:div
   [:h1 (:counter @app-state)]
   [:h2 (:text @app-state)]
   [:h3 "Edit this and watch it change j!"]])


(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  (swap! app-state update-in [:counter] inc)
)

(js/alert "This is an alarm")

(defn adding [a b]
  (+ a b))
