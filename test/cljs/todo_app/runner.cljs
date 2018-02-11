(ns todo-app.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [todo-app.core-test]))

(doo-tests 'todo-app.core-test)
