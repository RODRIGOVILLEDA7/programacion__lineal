(require 'demo-it)

(setq org-tree-slide-slide-in-effect nil)

(demo-it-create :single-window
		:fullscreen
		:text-xx-large
		:fixed-width
		:advance-mode
                (demo-it-presentation "talk.org") 
		demo-it-presentation-advance
		magit-status
		demo-it-presentation-return
		(demo-it-load-file "sage-mode-example.sage" :right :text-large)
		demo-it-presentation-return
		"M-x gap"
		demo-it-presentation-return
		(demo-it-load-file "org-babel-examples.org" :right :text-large)
		demo-it-presentation-return)

(demo-it-start)

