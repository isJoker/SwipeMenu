# SwipeMenu
自定义RecylerView的onItemTouchListener实现item的侧滑菜单

效果图：

![image](https://github.com/isJoker/SwipeMenu/blob/master/gif/SwipeMenu.gif) 

使用,链式调用：

        itemSwipeListener = new RecyclerItemSwipeListener(this, recycler);
        itemSwipeListener
                .setClickable(new RecyclerItemSwipeListener.OnRowClickListener() {
                    @Override
                    public void onRowClicked(int position) {
                        //todo
                    }

                    @Override
                    public void onIndependentViewClicked(int independentViewID, int position) {
                        //todo
                    }
                })
                .setIndependentViews(R.id.img_avatar)
                .setSwipeOptionViews(R.id.btn_stick, R.id.btn_delete)
                .setSwipeable(R.id.ll_item_msg, R.id.rl_swipe_btn, new RecyclerItemSwipeListener.OnSwipeOptionsClickListener() {
                    @Override
                    public void onSwipeOptionClicked(int viewID, int position) {
                       //todo
                    }
                });

        recycler.addOnItemTouchListener(itemSwipeListener);


