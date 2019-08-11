import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Publisher = (props) => {

  if(!props.publisher){
    return "Loading...publisher"
  }

  return (
    <React.Fragment>
      <h1>Name: {props.publisher.name}</h1>
    </React.Fragment>
  )

}

export default Publisher;
