(ns todo-app.views
  (:require [re-frame.core :as re-frame]
            [todo-app.subs :as subs]
            ))

(defn todo
  [todo-data]
  ^{:key (random-uuid)}
  [:div todo-data])

(defn main-panel []
  (let [todos (re-frame/subscribe [::subs/todos])]
    [:div
     (map todo @todos)]))
