import React, {Fragment} from 'react';
import {Link} from 'react-router-dom';

const Publisher = (props) => {

  if(!props.publisher){
    return "Loading...publisher"
  }

  return (
    <React.Fragment>

      <img src={props.publisher.logo} Transformation height="200" width="200" crop="fill" effect="sepia" radius="20" />
    </React.Fragment>
  )

}

export default Publisher;
