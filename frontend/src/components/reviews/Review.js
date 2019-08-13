import React from 'react';

const Review = (props) => {

  const reviews = props.comic._embedded.reviews.map((review, index) => {
    return <li key={index}>"{review.review}" -  left by: {review.user.alias}</li>
  })

  return (
      <React.Fragment>
        <ul>Reviews: {reviews}</ul>
      </React.Fragment>
  )

}

export default Review;
