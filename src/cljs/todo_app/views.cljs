(ns todo-app.views
  (:require [re-frame.core :as re-frame]
            [todo-app.subs :as subs]
            ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div "Hello from " @name " Parrot"]))
