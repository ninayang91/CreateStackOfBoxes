# CreateStackOfBoxes
Given an array of boxes, create a stack of boxes with max height

Youhaveastackof nboxes,withwidths w.,heights hir anddepths drTheboxes cannot be rotated and can only be stacked on top of one another if each box in the stack is strictly larger than the box above it in width, height, and depth. Implement a method to build the tallest stack possible, where the height of a stack is the sum of the heights of each box.

Choose each one as a bottome, check the rest one by one, if it is smaller, recursion call, createStack(Box[] a, a[i]), if the new one's height is larger, max_height=new_height, max_stack=new_stack

add the bottom to the max_stack.
