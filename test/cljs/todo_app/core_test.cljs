(ns todo-app.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [todo-app.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 1))))
