package com.example.product.common

const val API_V1 = "/api/v1";

const val API_PRODUCT = "$API_V1/products";
const val API_PRODUCT_CREATE = API_PRODUCT;
const val API_PRODUCT_GET = "$API_PRODUCT/{id}";
const val API_PRODUCT_UPDATE = "$API_PRODUCT/{id}";
const val API_PRODUCT_DELETE = "$API_PRODUCT/{id}";

const val API_CONFIG = "$API_V1/configs";
const val API_CONFIG_GET = "$API_CONFIG/{id}";
const val API_CONFIG_CREATE = API_CONFIG;
const val API_CONFIG_UPDATE = "$API_CONFIG/{id}";

const val API_COMMENT = "$API_V1/comments";
const val API_COMMENT_CREATE = API_COMMENT;
const val API_COMMENT_UPDATE = "$API_COMMENT/{id}";

const val API_VOTE = "$API_V1/votes";
const val API_VOTE_CREATE = API_VOTE;